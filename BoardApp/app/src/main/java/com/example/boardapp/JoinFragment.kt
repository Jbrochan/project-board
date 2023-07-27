package com.example.boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.boardapp.databinding.FragmentJoinBinding

class JoinFragment : Fragment() {
    lateinit var fragmentJoinBinding: FragmentJoinBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentJoinBinding = FragmentJoinBinding.inflate(layoutInflater)
        mainActivity = activity as MainActivity

        fragmentJoinBinding.run{
            toolbarJoin.run{
                title = "회원가입"
            }

            buttonJoinNext.run{
                setOnClickListener {
                    mainActivity.replaceFragment("AddUserInfoFragment", true, null)
                }
            }
        }

        // Inflate the layout for this fragment
        return fragmentJoinBinding.root
    }
}