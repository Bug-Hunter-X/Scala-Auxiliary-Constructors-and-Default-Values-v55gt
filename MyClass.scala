```scala
class MyClass(val value: Int) {
  def this() = this(0) // Default constructor
}

val instance1 = new MyClass(5)
val instance2 = new MyClass()

println(instance1.value) // Output: 5
println(instance2.value) // Output: 0

class MyOtherClass(val value: String) {
  def this(intValue: Int) = this(intValue.toString)
}

val instance3 = new MyOtherClass("Hello")
val instance4 = new MyOtherClass(123)

println(instance3.value) // Output: Hello
println(instance4.value) // Output: 123
```