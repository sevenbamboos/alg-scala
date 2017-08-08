package fpinscala.datastructures

import org.scalatest.{ BeforeAndAfterAll, FlatSpecLike, Matchers }

class ListSpec
  extends Matchers
  with FlatSpecLike
  with BeforeAndAfterAll {

  "A list" should "supports normal operators like sum and product" in {
    import fpinscala.datastructures.List._
    val l = List(5,4,3,2,1)
    sum(l) shouldEqual 15
  }

}
