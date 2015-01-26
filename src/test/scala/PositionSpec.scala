import org.scalatest._
import simulation.Position
import simulation.directions._

class PositionSpec extends FlatSpec with Matchers {
  it should "be able to determine the next position when facing North" in {
    val position = new Position(1, 1, North)

    assert(position.next == new Position(1, 2, North))
  }

  it should "be able to determine the next position when facing East" in {
    val position = new Position(1, 1, East)

    assert(position.next == new Position(2, 1, East))
  }

  it should "be able to determine the next position when facing South" in {
    val position = new Position(1, 1, South)

    assert(position.next == new Position(1, 0, South))
  }

  it should "be able to determine the next position when facing West" in {
    val position = new Position(1, 1, West)

    assert(position.next == new Position(0, 1, West))
  }

  it should "be able to determine the left position" in {
    val position = new Position(1, 1, West)

    assert(position.left == new Position(1, 1, South))
  }


  it should "be able to determine the right position" in {
    val position = new Position(1, 1, West)

    assert(position.right == new Position(1, 1, North))
  }
}
