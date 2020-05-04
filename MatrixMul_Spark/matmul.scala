import org.apache.spark.mllib.linalg.DenseMatrix
import java.util.Random

object Main extends App {
	println("Matrix multiplication using spark!")
	val mat_dim = 1000
	val N = 100

	// Create a dense matrix ((1.0, 2.0), (3.0, 4.0), (5.0, 6.0))
	//val dm: DenseMatrix = Matrices.dense(3, 2, Array(1.0, 3.0, 5.0, 2.0, 4.0, 6.0))
	//val dm2: DenseMatrix = Matrices.dense(2, 1, Array(1.0, 1.0))

	var total_time = 0.0

	for(i<-1 to N) {

		val rng = new Random()
		//println(rng)

		val dm = DenseMatrix.rand(mat_dim, mat_dim, rng)
		val dm2 = DenseMatrix.rand(mat_dim, mat_dim, rng)


		val begin = System.currentTimeMillis()
		val res = dm.multiply(dm2)
		val end = System.currentTimeMillis()
		//println(res)
		val curr_time = (end-begin)/1e3
		total_time += curr_time
		println(i)
		println("ProcessTime: %f".format(curr_time))
	}

	println(total_time)
	println(total_time/N)

	//val lhs = DenseMatrix(3, 2, Array(1.0, 3.0, 5.0, 2.0, 4.0, 6.0))
	//val rhs = DenseMatrix(2, 1, Array(1.0, 1.0))
	//val product = lhs.mutiply(rhs)//lhs * rhs
	//println(product)
}
