import React from 'react';
import WeatherService from '../services/WeatherService';

class HistoricLisbonTemps extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            temps:[]
        }
    }

    componentDidMount() {
        WeatherService.get_temp_history_lisbon().then((response) => {
            this.setState({ temps: response.data })
        });
    }

    render() {
        return (
            
            <div>
                <br></br>
                <h1 className="center"> Histórico de temperaturas em Lisboa </h1>
                <br></br>
                <table className="table table-striped"> 
                    <thead>
                        <tr>

                            <td> Nome </td>
                            <td> Temperatura </td>
                            <td> Data de Publicação </td>
                        </tr>
                    </thead>
                    <tbody>

                        {
                            this.state.temps.map(
                                temp =>
                                <tr key={temp.id}>
                                    <td> {temp.cityname} </td>
                                    <td> {temp.temp} </td>
                                    <td> {temp.publicationDateTime} </td>
                                </tr> 
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}

export default HistoricLisbonTemps