package `in`.aayushgoyal.popcorntimes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TopContributorsAdapter(private val context: Context, private val topContributorsList: List<TopContributor>) : RecyclerView.Adapter<TopContributorsAdapter.TopContributorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopContributorsAdapter.TopContributorViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_profile_credit_top_contributor, parent, false)
        view.findViewById<TextView>(R.id.tv_contribution_type_list_item_profiles_credits_top_contributors).visibility = View.GONE
        view.findViewById<ImageView>(R.id.iv_github_list_item_profiles_credits_top_contributors).visibility = View.GONE
        return TopContributorViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: TopContributorsAdapter.TopContributorViewHolder, position: Int) {
        val topContributor = topContributorsList[position]
    }

    override fun getItemCount() = topContributorsList.size

    inner class TopContributorViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val ivUserProfilePicture = itemView.findViewById<ImageView>(R.id.iv_user_profile_picture_list_item_profiles_credits_top_contributors)
        val tvUserFullName = itemView.findViewById<TextView>(R.id.tv_user_full_name_list_item_profiles_credits_top_contributors)
        val tvContributionAmount = itemView.findViewById<TextView>(R.id.tv_contribution_amount_list_item_profiles_credits_top_contributors)
        val ivEmail = itemView.findViewById<ImageView>(R.id.iv_email_list_item_profiles_credits_top_contributors)
        val ivFacebook = itemView.findViewById<ImageView>(R.id.iv_facebook_list_item_profiles_credits_top_contributors)
        val ivTwitter = itemView.findViewById<ImageView>(R.id.iv_twitter_list_item_profiles_credits_top_contributors)
        val ivInstagram = itemView.findViewById<ImageView>(R.id.iv_instagram_list_item_profiles_credits_top_contributors)
    }
}