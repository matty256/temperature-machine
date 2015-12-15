package bad.robot.temperature

import java.util.Date

import scala.concurrent.duration.Duration

package object rrd {

  val anHour = Duration(1, "hour")
  val aDay = Duration(24, "hours")
  val aWeek = Duration(7, "days")

  def now() = Seconds(timeInSeconds(new Date()))

  def timeInSeconds(date: Date) = (date.getTime + 499L) / 1000L
}
