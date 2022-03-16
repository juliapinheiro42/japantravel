import React, { Component } from 'react';
import TicketsService from '../../services/TicketsService';
import './style.css';

class ViewTicketsComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            tickets: {}
        }
    }

    componentDidMount(){
        TicketsService.getTicketsById(this.state.id).then( res => {
            this.setState({tickets: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View Tickets Details</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> Tickets  Name: </label>
                            <div> { this.state.tickets.name }</div>
                        </div>
                        <div className = "row">
                            <label> Tickets Price: </label>
                            <div> { this.state.tickets.price }</div>
                        </div>
                        <div className = "row">
                            <label>Tickets status: </label>
                            <div> { this.state.tickets.status }</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default ViewTicketsComponent