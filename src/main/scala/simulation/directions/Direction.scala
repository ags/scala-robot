package simulation.directions

sealed trait Direction {
  def name: String
  def left: Direction
  def right: Direction
  override def toString = name
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
