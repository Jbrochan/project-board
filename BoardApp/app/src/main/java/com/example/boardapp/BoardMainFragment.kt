package com.example.boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.boardapp.databinding.FragmentBoardMainBinding

class BoardMainFragment : Fragment() {

    lateinit var fragmentBoardMainBinding: FragmentBoardMainBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBoardMainBinding = FragmentBoardMainBinding.inflate(inflater)
        mainActivity = activity as MainActivity

        fragmentBoardMainBinding.run{
            toolbarBoardMain.run{
                title = "게시판메인"
                setNavigationIcon(android.R.drawable.ic_dialog_dialer)
                setNavigationOnClickListener {
                    drawerLayoutBoardMain.open()
                }
            }
        }

        return fragmentBoardMainBinding.root
    }
}