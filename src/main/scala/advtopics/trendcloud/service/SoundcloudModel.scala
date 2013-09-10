package advtopics.trendcloud.service

import com.google.inject.Inject
import com.google.inject.name.Named
import advtopics.trendcloud.models.SoundcloudTrack

class SoundcloudModel{

  @Inject
  var reader: SoundcloudReaderInterface = null
  
  def readSounds(keyword:String): List[SoundcloudTrack] = {
    reader.fetch(keyword)
  }
}