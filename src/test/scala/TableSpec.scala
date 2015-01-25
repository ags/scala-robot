import org.scalatest._
import simulation.Table
import simulation.Position
import simulation.directions._

class TableSpec extends FlatSpec with Matchers {
  it should "be able to determine next position given one" in {
    val table = new Table(3, 3)

    val next = table.nextPosition(new Position(North, 1, 1))

    assert(next == new Position(North, 1, 2))
  }

  it should "not determine the next position to be one out of bounds" in {
    val table = new Table(3, 3)

    val next = table.nextPosition(new Position(South, 0, 0))

    assert(next == new Position(South, 0, 0))
  }
}
