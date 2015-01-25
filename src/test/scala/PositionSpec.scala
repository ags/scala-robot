import org.scalatest._
import simulation.Position
import simulation.directions._

class PositionSpec extends FlatSpec with Matchers {
  it should "be able to determine the next position when facing North" in {
    val position = new Position(North, 1, 1)

    assert(position.next == new Position(North, 1, 2))
  }

  it should "be able to determine the next position when facing East" in {
    val position = new Position(East, 1, 1)

    assert(position.next == new Position(East, 2, 1))
  }

  it should "be able to determine the next position when facing South" in {
    val position = new Position(South, 1, 1)

    assert(position.next == new Position(South, 1, 0))
  }

  it should "be able to determine the next position when facing West" in {
    val position = new Position(West, 1, 1)

    assert(position.next == new Position(West, 0, 1))
  }

  it should "be able to determine the left position" in {
    val position = new Position(West, 1, 1)

    assert(position.left == new Position(South, 1, 1))
  }


  it should "be able to determine the right position" in {
    val position = new Position(West, 1, 1)

    assert(position.right == new Position(North, 1, 1))
  }
}
