import simulation.Position

package simulation {
  case class Table(height: Int, width: Int) {
    def nextPosition(position: Position) = position.next match {
      case Position(_, x, y) if x < 0 || y < 0 || x > width || y > height =>
        position
      case _ =>
        position.next
    }
  }
}
