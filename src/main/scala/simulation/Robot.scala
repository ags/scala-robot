import simulation.Table
import simulation.Position

package simulation {
  class Robot(board: Table) {
    var position: Option[Position] = None

    // TODO validate on board
    def place(newPosition: Position) = {
      position = Some(newPosition)
    }

    def move() = position.foreach(p => place(board.nextPosition(p)))

    def turnLeft() = position.foreach(p => place(p.left))

    def turnRight() = position.foreach(p => place(p.right))
  }
}
