import org.scalatest._

class RiverMeetingPointFinderSpec extends FlatSpec {
  val riversMeetingPointFinder = new RiversMeetingPointFinder

  "element in river next to 7" should "be 14" in {
    assert(riversMeetingPointFinder.calculateNextRiverElementInSeries(7) === 14)
  }

  "element in river next to 471" should "be 483" in {
    assert(riversMeetingPointFinder.calculateNextRiverElementInSeries(471) === 483)
  }

  "river next to 42" should "meet river 42 at 42" in {
    assert(riversMeetingPointFinder.calculateNextMeetingPoint(42, 42) === 42)
  }

  "river next to 471" should "meet river 480 at 519" in {
    assert(riversMeetingPointFinder.calculateNextMeetingPoint(471, 480) === 519)
  }

  "river next to 32" should "meet river 47 at 47" in {
    assert(riversMeetingPointFinder.calculateNextMeetingPoint(32, 47) === 47)
  }
}
