@file:JvmName("DisplayFunctions")
package com.rsk

fun main() {
  log(message = "Hello World", logLevel = 2)
  val text    = " With     multiple \t whitespace"
  println("Helper Function : == "+ replaceMultipleWhiteSpace(text))
  println("Extension Function : == "+ text.replaceMutlipleWhiteSpace_ExtensionFunction())
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1){
  println(message+" "+logLevel)
}

fun replaceMultipleWhiteSpace(value: String) : String{
  var regex = Regex("\\s+")
  return regex.replace(value, " ").trim()
}

fun String.replaceMutlipleWhiteSpace_ExtensionFunction() : String {
  var regex = Regex("\\s+")
  return regex.replace(this, " ").trim();
}