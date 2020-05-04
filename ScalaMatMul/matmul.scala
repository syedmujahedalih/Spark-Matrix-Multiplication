import scala.collection.mutable.ListBuffer


object Main extends App {
	println("Matrix multiplication using scala!")
	val mat_dim = 3
	val N = 100

	val start = 0
	val end   = 100
	val rnd = new scala.util.Random
	

	val rows = 1000
	val cols = 1000
	val a1 = Array.ofDim[Double](rows, cols)
	val a2 = Array.ofDim[Double](rows, cols)
	val prod = Array.ofDim[Double](rows,cols)
	for (i <- 0 to rows-1) {
		for (j <- 0 to cols-1) {
			a1(i)(j) = start + rnd.nextInt( (end - start) + 1 )
		}
	}

	for (i <- 0 to rows-1) {
		for (j <- 0 to cols-1) {
			a2(i)(j) = start + rnd.nextInt( (end - start) + 1 )
		}
	}

	/*for testing 
	val mat1: List[List[Double]] =
		List(
			List(1, 0, 1),
			List(0, 2, 0),
			List(0, 0, 1)
		)

	val mat2: List[List[Double]] =
		List(
			List(1, 0, 0),
			List(0, 2, 0),
			List(0, 0, 3)
		)*/
	//var prod = for (i <- 1 to mat_dim) yield (for (j <- 1 to mat_dim) yield (r.nextFloat))
	//var prod = ListBuffer(ListBuffer(0.0,0.0,0.0), ListBuffer(0.0,0.0,0.0), ListBuffer(0.0,0.0,0.0)) //new ListBuffer[Double]()
	//var prod = ListBuffer.fill(mat_dim)(ListBuffer.fill(mat_dim)(0.0)) //for (i <- 1 to mat_dim) yield (ListBuffer.range(1, mat_dim))

	//val r = scala.util.Random
	val total_time = System.nanoTime

	for(i<-1 to N){

		println("the current Iteration is %d".format(i))

		val begin = System.currentTimeMillis()
		for (i <- 0 to rows-1) {
			for (j <- 0 to cols-1) {
				var sum = 0.0
				for (k <- i to cols-1) {
					sum = sum + a1(i)(k) * a2(k)(j)
				}
				prod(i)(j) = sum
			}
		}
		val end = System.currentTimeMillis()
		val curTime = (end-begin)/1e3
                println("The time is: %f".format(curTime))
		//total_time = total_time + curTime

	}
	

	println("total time is %f".format((System.nanoTime-total_time)/1e9d))
}
