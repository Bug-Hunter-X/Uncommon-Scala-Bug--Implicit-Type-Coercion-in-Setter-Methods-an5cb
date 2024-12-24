```scala
class MyClass(val name: String) {
  private var _value: Int = 0

  def value: Int = _value
  def value_=(newValue: Int): Unit = {
    if (newValue < 0) {
      throw new IllegalArgumentException("Value cannot be negative")
    }
    else {
        _value = newValue
    }
  }

  //Adding explicit type checking for different types
  def value_=(newValue: String): Unit = {
      try{
        val num = newValue.toInt
        if(num < 0){
          throw new IllegalArgumentException("Value cannot be negative")
        }
        else{
          _value = num
        }
      } catch {
          case e: NumberFormatException => println("Invalid Input Type: String cannot be converted to Integer")
      }
  }
}
```