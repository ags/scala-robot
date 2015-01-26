import org.scalatest._
import simulation.directions._
import simulation.Position
import simulation.commands.PlaceCommand

class PlaceCommandSpec extends FlatSpec with Matchers {
  it should "be able to parse a valid direction" in {
    val command = PlaceCommand.unapply("PLACE 1,2,NORTH")

    assert(command == Some(new Position(1, 2, North)))
  }

  it should "be None for a poorly formed command" in {
    val command = PlaceCommand.unapply("PLACE 12NORTH")

    assert(command == None)
  }

  it should "be None for a well formed command with invalid co-ordinates" in {
    val command = PlaceCommand.unapply("PLACE x,y,NORTH")

    assert(command == None)
  }

  it should "be None for a well formed command with an invalid direction" in {
    val command = PlaceCommand.unapply("PLACE 1,1,UP")

    assert(command == None)
  }
}
