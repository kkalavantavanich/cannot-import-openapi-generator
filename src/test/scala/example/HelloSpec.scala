package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hi" in {
    Hello.greeting shouldEqual "hi"
  }
}
