import java.util.Collections

/**
  * @Author : Huyong
  * @Description : 
  * @Date : 13:51 2019/6/13
  */
object BinarySearch extends App {
  var array = Array[Int](1,54,2,32,3,4,77,21,5,213)
  array = array.sorted
  for(i <- 0 to array.length-1){
    print{array(i) + " "}
  }
  var start = 0
  var end = array.length -1
  println(search(array,4,start,end))

  def search(array:Array[Int],key:Int,start:Int,end:Int): Int ={
    if(start > end)
     return -1
    val mid = start + (end - start) / 2
    if(key < array(mid))
      return search(array,key,start,mid - 1)
    if(key > array(mid))
      return search(array,key,mid + 1,end)
    return mid
  }
}
