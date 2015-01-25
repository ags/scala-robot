import simulation.Table
import simulation.Robot
import simulation.Position
import simulation.directions._

object Main {
  def report(robot: Robot) = println(robot.position getOrElse "not placed")

  def main(args: Array[String]) = {
    val table = new Table(3, 3)
    val robot = new Robot(table)

    report(robot)

    robot.place(new Position(North, 0, 0))
    report(robot)

    robot.move()
    report(robot)

    robot.turnLeft()
    robot.move()
    report(robot)

    robot.move()
    report(robot)

    robot.turnRight()
    robot.move()
    report(robot)
  }
}
