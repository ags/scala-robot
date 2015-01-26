import simulation.directions._

package simulation {
  case class Position(x: Int, y: Int, direction: Direction) {
    def next = direction match {
      case North => new Position(x, y + 1, direction)
      case East  => new Position(x + 1, y, direction)
      case South => new Position(x, y - 1, direction)
      case West  => new Position(x - 1, y, direction)
    }

    def left = new Position(x, y, direction.left)

    def right = new Position(x, y, direction.right)

    override def toString = "%d,%d,%s" format(x, y, direction)
  }
}
