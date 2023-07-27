package com.example.boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.boardapp.databinding.FragmentAddUserInfoBinding

class AddUserInfoFragment : Fragment() {
    lateinit var fragmentAddUserInfoBinding: FragmentAddUserInfoBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentAddUserInfoBinding = FragmentAddUserInfoBinding.inflate(layoutInflater)
        mainActivity = activity as MainActivity

        fragmentAddUserInfoBinding.run{
            toolbarAddUserInfo.run{
                title = "추가 정보 입력"
            }

            buttonAddUserInfoDone.run{
                // 완료 버튼을 터치하면 로그인 화면으로 이동
                setOnClickListener {
                    mainActivity.removeFragment("AddUserInfoFragment")
                    mainActivity.removeFragment("JoinFragment")
                }
            }
        }

        return fragmentAddUserInfoBinding.root
    }
}