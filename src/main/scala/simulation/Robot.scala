import simulation.Table
import simulation.Position

package simulation {
  class Robot(table: Table) {
    var position: Option[Position] = None

    def place(newPosition: Position) = {
      if (table includes newPosition) {
        position = Some(newPosition)
      }
    }

    def move() = position.foreach(p => place(p.next))

    def turnLeft() = position.foreach(p => place(p.left))

    def turnRight() = position.foreach(p => place(p.right))
  }
}
