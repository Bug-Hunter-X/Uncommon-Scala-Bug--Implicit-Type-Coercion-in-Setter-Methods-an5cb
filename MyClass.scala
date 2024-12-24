```scala
class MyClass(val name: String) {
  private var _value: Int = 0

  def value: Int = _value
  def value_=(newValue: Int): Unit = {
    if (newValue < 0) {
      throw new IllegalArgumentException("Value cannot be negative")
    } else {
      _value = newValue
    }
  }
}
```