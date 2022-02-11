package com.kktua.appaprendaingles.ui.numbers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.kktua.appaprendaingles.R
import com.kktua.appaprendaingles.core.playSound

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NumbersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NumbersFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_numbers, container, false)

        startButtonListeners(view)

        return view
    }

    private fun startButtonListeners(view: View) {
        view.findViewById<ImageButton>(R.id.ib_image1).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.ib_image2).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.ib_image3).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.ib_image4).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.ib_image5).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.ib_image6).setOnClickListener(this)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NumbersFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NumbersFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ib_image1 -> {
                playSound(R.raw.one, activity)
            }
            R.id.ib_image2 -> {
                playSound(R.raw.two, activity)
            }
            R.id.ib_image3 -> {
                playSound(R.raw.three, activity)
            }
            R.id.ib_image4 -> {
                playSound(R.raw.four, activity)
            }
            R.id.ib_image5 -> {
                playSound(R.raw.five, activity)
            }
            R.id.ib_image6 -> {
                playSound(R.raw.six, activity)
            }
        }
    }
}