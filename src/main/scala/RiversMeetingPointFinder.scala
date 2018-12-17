class RiversMeetingPointFinder {
  def calculateNextRiverElementInSeries(baseInt: Long): Long = baseInt.toString.map(_.asDigit).sum + baseInt

  def calculateNextMeetingPoint(firstRiverElement: Long, secondRiverElement: Long): Long = {
    val updatedFirstRiverElement = calculateNextRiverElementIfLesserThanElement(firstRiverElement, secondRiverElement)
    val updatedSecondRiverElement = calculateNextRiverElementIfLesserThanElement(secondRiverElement, firstRiverElement)

    if (updatedFirstRiverElement != updatedSecondRiverElement) calculateNextMeetingPoint(updatedFirstRiverElement, updatedSecondRiverElement)
    else updatedFirstRiverElement
  }

  private def calculateNextRiverElementIfLesserThanElement(currentElement: Long, threshold: Long) = {
    if (currentElement < threshold) calculateNextRiverElementInSeries(currentElement) else currentElement
  }
}
