import scala.collection.mutable.ArrayBuffer
import breeze.linalg._
object Main extends App {

    println("Matrix multiplication using spark-Breeze!")

    var total_time = 0.0
    val num_row_dim1 = 1000
    val num_col_dim1 = 1000
    val num_row_dim2 = 1000
    val num_col_dim2 = 1000
    val N = 100
    for(i<-1 to N){
     
        val lhs = DenseMatrix.rand[Double](num_row_dim1, num_col_dim1)
        val rhs = DenseMatrix.rand[Double](num_row_dim2, num_col_dim2)
        val begin = System.currentTimeMillis()
        val product = lhs * rhs
        val end = System.currentTimeMillis()
        println("ProcessTime: %f".format((end-begin)/1e3))
        total_time += (end-begin)/1e3
}
print("the time taken is %f".format(total_time))

}
