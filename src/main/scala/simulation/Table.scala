import simulation.Position

package simulation {
  case class Table(height: Int, width: Int) {
    def includes(position: Position) = {
      position.x >= 0 && position.y >= 0 &&
        position.x < width && position.y < height
    }
  }
}
