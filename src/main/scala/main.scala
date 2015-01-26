import simulation.Robot
import simulation.Table
import simulation.commands.PlaceCommand

object Main {
  def report(robot: Robot) = println(robot.position getOrElse "not placed")

  def main(args: Array[String]) = {
    val table = new Table(5, 5)
    val robot = new Robot(table)

    for (line <- io.Source.stdin.getLines) {
      line.toUpperCase match {
        case PlaceCommand(position) => robot.place(position)
        case "MOVE"                 => robot.move()
        case "LEFT"                 => robot.turnLeft()
        case "RIGHT"                => robot.turnRight()
        case "REPORT"               => report(robot)
        case _                      => println("unknown command")
      }
    }
  }
}
