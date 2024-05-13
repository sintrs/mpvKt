package live.mehiz.mpvkt.ui.player

import `is`.xyz.mpv.MPVLib

class PlayerObserver(
  private val activity: PlayerActivity
): MPVLib.EventObserver {
  override fun eventProperty(property: String) {
    activity.runOnUiThread { activity.onObserverEvent(property) }
  }

  override fun eventProperty(property: String, value: Long) {
    activity.runOnUiThread { activity.onObserverEvent(property, value) }
  }

  override fun eventProperty(property: String, value: Boolean) {
    activity.runOnUiThread { activity.onObserverEvent(property, value) }
  }

  override fun eventProperty(property: String, value: String) {
    activity.runOnUiThread { activity.onObserverEvent(property, value) }
  }

  override fun event(eventId: Int) {

  }

  override fun efEvent(err: String?) {
  }
}
