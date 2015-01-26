import scala.util.matching.Regex
import simulation.directions._
import simulation.Position

package simulation.commands {
  object PlaceCommand {
    val place = new Regex("""PLACE (\d+),(\d+),([A-Z]+)""")

    def unapply(string: String) = string match {
      case place(x, y, Direction(direction)) =>
        Some(new Position(x.toInt, y.toInt, direction))
      case _ =>
        None
    }
  }
}
