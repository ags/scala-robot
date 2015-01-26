import org.scalatest._
import simulation.Robot
import simulation.Table
import simulation.Position
import simulation.directions._

class RobotSpec extends FlatSpec with Matchers {
  it should "not be able to move until placed" in {
    val robot = new Robot(new Table(3, 3))

    robot.move()

    assert(robot.position == None)
  }

  it should "be able to move once placed" in {
    val robot = new Robot(new Table(3, 3))
    robot.place(new Position(1, 1, North))

    robot.move()

    assert(robot.position == Some(new Position(1, 2, North)))
  }

  it should "not be able to be placed outsided the table" in {
    val robot = new Robot(new Table(3, 3))
    robot.place(new Position(4, 4, North))

    assert(robot.position == None)
  }

  it should "not be able to turn left until placed" in {
    val robot = new Robot(new Table(3, 3))

    robot.turnLeft()

    assert(robot.position == None)
  }

  it should "be able to turn left once placed" in {
    val robot = new Robot(new Table(3, 3))
    robot.place(new Position(1, 1, North))

    robot.turnLeft()

    assert(robot.position == Some(new Position(1, 1, West)))
  }

  it should "not be able to turn right until placed" in {
    val robot = new Robot(new Table(3, 3))

    robot.turnRight()

    assert(robot.position == None)
  }

  it should "be able to turn right once placed" in {
    val robot = new Robot(new Table(3, 3))
    robot.place(new Position(1, 1, North))

    robot.turnRight()

    assert(robot.position == Some(new Position(1, 1, East)))
  }
}
