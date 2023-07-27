package com.example.boardapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.boardapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var fragmentLoginBinding: FragmentLoginBinding
    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater)
        mainActivity = activity as MainActivity

        fragmentLoginBinding.run{
            toolbarLogin.run{
                title = "로그인"
            }

            buttonLoginJoin.run{
                setOnClickListener {
                    // 회원가입 화면으로 이동
                    mainActivity.replaceFragment("JoinFragment", true, null)
                }
            }
        }

        return fragmentLoginBinding.root
    }
}