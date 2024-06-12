
  2.. armstrong

  //2.ARMSTRONG NO
  fun main() {
    var no=153
    var rem=0
    var sum=0
    val temp=no
    while(no<0){
        rem=no%10
        sum=sum+(rem*rem*rem)
        no=no/10
    }
    if(temp==sum){
        println("$temp is armstrong no")
    }
    else
    {
        println("$temp is not armstrong")
    }
}
