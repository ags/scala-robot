import org.scalatest._
import simulation.Table
import simulation.Position
import simulation.directions._

class TableSpec extends FlatSpec with Matchers {
  it should "be true when position is within board boundaries" in {
    val table = new Table(3, 3)

    assert(table includes new Position(North, 0, 0))
  }

  it should "be false when the lower height bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(North, 0, -1)))
  }

  it should "be false when the upper height bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(North, 0, 3)))
  }

  it should "be false when the lower width bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(North, -1, 0)))
  }

  it should "be false when the upper width bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(North, 3, 0)))
  }
}
