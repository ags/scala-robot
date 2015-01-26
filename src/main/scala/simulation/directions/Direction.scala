package simulation.directions

sealed trait Direction {
  val name: String
  val left: Direction
  val right: Direction

  override def toString = name
}

object Direction {
  def unapply(string: String) = string match {
    case North.name => Some(North)
    case East.name  => Some(East)
    case South.name => Some(South)
    case West.name  => Some(West)
    case _          => None
  }
}

case object North extends Direction {
  val name = "NORTH"
  val left = West
  val right = East
}

case object East extends Direction {
  val name = "EAST"
  val left = North
  val right = South
}

case object South extends Direction {
  val name = "SOUTH"
  val left = East
  val right = West
}

case object West extends Direction {
  val name = "WEST"
  val left = South
  val right = North
}
