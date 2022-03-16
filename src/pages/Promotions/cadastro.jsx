import React, { Component } from 'react'
import TicketsService from '../../services/TicketsService';
import './style.css';

class CadastroComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                tickets: []
        }
        this.addTickets = this.addTickets.bind(this);
        this.editTickets = this.editTickets.bind(this);
        this.deleteTickets = this.deleteTickets.bind(this);
    }

    deleteTickets(id){
        TicketsService.deletetickets(id).then( res => {
            this.setState({tickets: this.state.tickets.filter(tickets => tickets.id !== id)});
        });
    }
    viewTickets(id){
        this.props.history.push(`/view-tickets/${id}`);
    }
    editTickets(id){
        this.props.history.push(`/add-tickets/${id}`);
    }

    componentDidMount(){
        TicketsService.getTickets().then((res) => {
            this.setState({ tickets: res.data});
        });
    }

    addTickets(){
        this.props.history.push('/add-tickets/_add');
    }

    render() {
        return (
            <div>
                 <h2 className="text-center">Tickets List</h2>
                 <div className = "row">
                    <button onClick={this.addTickets} className='btn'> Add tickets</button>
                 </div>
                 <br></br>
                 <div className = "row d-flex flex-column">
                        <table className = "table table-striped table-bordered" >
                            <thead>
                                <tr>
                                    <th> Tickets  Name</th>
                                    <th> Tickets price</th>
                                    <th> Tickets status</th>
                                    <th> Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.tickets.map(
                                        tickets => 
                                        <tr key = {tickets.id}>
                                             <td> { tickets.name} </td>   
                                             <td> {tickets.price}</td>
                                             <td> {tickets.status}</td>
                                             <td>
                                                 <button className='btn' onClick={ () => this.editTickets(tickets.id)}>Update </button>
                                                 <button className='btn' onClick={ () => this.deleteTickets(tickets.id)} >Delete </button>
                                                 <button className='btn' onClick={ () => this.viewTickets(tickets)}>View</button>
                                               </td>
                                         </tr>
                                    )}
                             </tbody>
                        </table>

                 </div>

            </div>
            
        )
    }
}

export default CadastroComponent;