package com.example.cryptocurrencyapp.presentation.coin_detail.components
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cryptocurrencyapp.data.remote.dto.TeamMember

import androidx.compose.ui.text.font.FontStyle
@Composable
fun TeamListItem(
teamMember: TeamMember,
modifier: Modifier = Modifier
){

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center

    ){
      Text(
         text = teamMember.name,
         style = MaterialTheme.typography.h4



      )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.body2,
            fontStyle = FontStyle.Italic



        )
    }



}