import scala.util.matching.Regex
import simulation.directions._
import simulation.Position

package simulation.commands {
  object PlaceCommand {
    val place = new Regex("""PLACE ([A-Z]+),(\d),(\d)""")

    def unapply(string: String) = string match {
      case place(Direction(direction), x, y) =>
        Some(new Position(direction, x.toInt, y.toInt))
      case _ =>
        None
    }
  }
}
