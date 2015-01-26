import org.scalatest._
import simulation.directions._
import simulation.Position
import simulation.commands.PlaceCommand

class PlaceCommandSpec extends FlatSpec with Matchers {
  it should "be able to parse a valid direction" in {
    val command = PlaceCommand.unapply("PLACE NORTH,1,2")

    assert(command == Some(new Position(North, 1, 2)))
  }

  it should "be None for a poorly formed command" in {
    val command = PlaceCommand.unapply("PLACE NORTH12")

    assert(command == None)
  }

  it should "be None for a well formed command with invalid co-ordinates" in {
    val command = PlaceCommand.unapply("PLACE NORTH,x,y")

    assert(command == None)
  }

  it should "be None for a well formed command with an invalid direction" in {
    val command = PlaceCommand.unapply("PLACE UP,1,1")

    assert(command == None)
  }
}
