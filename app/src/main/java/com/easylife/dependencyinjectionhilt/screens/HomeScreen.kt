package com.easylife.dependencyinjectionhilt.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.easylife.dependencyinjectionhilt.viewmodel.UserViewModel


@Composable
fun HomeScreen(
    modifier: Modifier,
    viewModel: UserViewModel = hiltViewModel()
){
    val name  = viewModel.userName

    LaunchedEffect(Unit) {
        viewModel.loadUser()
    }


    Column(
        modifier = modifier
    ) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = name.value.ifEmpty { "Loading..." },
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}