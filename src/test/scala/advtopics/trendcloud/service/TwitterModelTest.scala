package advtopics.trendcloud.service

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito._
import com.google.inject.Inject
import org.mockito.stubbing.Answer
import org.mockito.invocation.InvocationOnMock
import advtopics.trendcloud.models.TwitterModel

class TwitterModelTest {

  var mockTwitterModel: TwitterModel = null
  val woeidOfBerlin: Integer = 638242

  @Before
  def instantiate: Unit = {

  }

  @Test
  def readLatestTest: Unit = {
    if (ModelFactoryTest.getTwitterModelTest().readLatest(woeidOfBerlin)(0).equals("ram"))
      assert(true)
  }

}