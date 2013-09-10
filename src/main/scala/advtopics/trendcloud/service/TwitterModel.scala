package advtopics.trendcloud.service

import com.google.inject.Inject
import advtopics.trendcloud.Loggable

/**
 * This is model for encapsulating all data
 * retrieved from the Twitter API.
 * The actual reader is injected with Guice.
 */
class TwitterModel extends Loggable{

  @Inject
  var reader:TwitterReaderInterface = null
  
  def readLatest(woeid:Integer): Array[String] = {
    logger.info("Read latest trends for woeid: " + woeid);
    reader.fetch(woeid)
  }

}