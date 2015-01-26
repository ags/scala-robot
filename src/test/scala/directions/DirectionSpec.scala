import org.scalatest._
import simulation.directions._

class DirectionSpec extends FlatSpec with Matchers {
  it should "be able to convert a String to a Direction" in {
    val d = Direction.unapply("NORTH")

    assert(d == Some(North))
  }
}
