package scala

/**
  * Created by yaohou on 0:31 2017/12/21.
  * description: 
  */
class Calculator(brand: String) {
  // 下面 面的例子展示了如何在类中用 def 定义方法和用 val 定义字段值。方法就是可以访问类的状态的函数。
  //val brand: String = "HP"
  def add(m: Int, n: Int): Int = m + n
  var brands = "hp"
  var model = "20B"
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }
//  val calc = new Calculator//calc//: Calculator = Calculator@e75a11scala>
//  calc.add(1, 2)//res1: Int = 3
//  calc.brand//res2//: String = "HP"
}
//defined class Calculatorscala>

