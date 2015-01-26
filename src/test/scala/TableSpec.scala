import org.scalatest._
import simulation.Table
import simulation.Position
import simulation.directions._

class TableSpec extends FlatSpec with Matchers {
  it should "be true when position is within board boundaries" in {
    val table = new Table(3, 3)

    assert(table includes new Position(0, 0, North))
  }

  it should "be false when the lower height bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(0, -1, North)))
  }

  it should "be false when the upper height bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(0, 3, North)))
  }

  it should "be false when the lower width bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(-1, 0, North)))
  }

  it should "be false when the upper width bound is exceeded" in {
    val table = new Table(3, 3)

    assert(!(table includes new Position(3, 0, North)))
  }
}
