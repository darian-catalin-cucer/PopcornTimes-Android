package `in`.aayushgoyal.popcorntimes

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

import `in`.aayushgoyal.popcorntimes.ui.favorites.FavoritesFragment
import `in`.aayushgoyal.popcorntimes.ui.favorites.WatchlistFragment

class FavoritesWatchlistFragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            FavoritesFragment()
        else
            WatchlistFragment()
    }
}