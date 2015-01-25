import simulation.directions._

package simulation {
  case class Position(direction: Direction, x: Int, y: Int) {
    def next = direction match {
      case North => new Position(direction, x, y + 1)
      case East  => new Position(direction, x + 1, y)
      case South => new Position(direction, x, y - 1)
      case West  => new Position(direction, x - 1, y)
    }

    def left = new Position(direction.left, x, y)

    def right = new Position(direction.right, x, y)

    override def toString = "%d,%d,%s" format(x, y, direction)
  }
}
