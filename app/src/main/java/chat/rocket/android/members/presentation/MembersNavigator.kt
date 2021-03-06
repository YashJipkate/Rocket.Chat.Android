package chat.rocket.android.members.presentation

import chat.rocket.android.chatdetails.ui.ChatDetailsActivity
import chat.rocket.android.members.ui.TAG_MEMBER_BOTTOM_SHEET_FRAGMENT
import chat.rocket.android.members.ui.newInstance

class MembersNavigator(internal val activity: ChatDetailsActivity) {

    fun toMemberDetails(avatarUri: String, realName: String, username: String, email: String, utcOffset: String) {
        activity.apply {
            newInstance(avatarUri, realName, username, email, utcOffset)
                .show(supportFragmentManager, TAG_MEMBER_BOTTOM_SHEET_FRAGMENT)
        }
    }
}
