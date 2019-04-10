import React, { Component } from 'react'
import { install } from '@material-ui/styles';
install();
import Nav from '../components/Nav'
import TeaTable from '../components/table/TeaTable'


export default class extends Component {
  state = {

  };

  render() {
    return(
      <React.Fragment>
        <Nav />
        <TeaTable />
      </React.Fragment>
      )
  }

}