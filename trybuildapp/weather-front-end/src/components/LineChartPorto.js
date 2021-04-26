import React from 'react';
import { Line } from 'react-chartjs-2';
import WeatherService from '../services/WeatherService';

class LineChartPorto extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            data:[]
        }
    }

    componentDidMount() {
        WeatherService.get_temp_history_porto().then((response) => {
            this.setState({ data: response.data, isLoaded: true })
        });
    }

    getTemperatures() {
        const temperatures = [];
        
        for (let temp of this.state.data) {
            temperatures.push(temp.temp);
        }
    
        return temperatures;
    }

    getTimes() {
        const times = [];
        
        for (let time of this.state.data) {
            times.push(time.publicationDateTime);
        }

        return times;
    }

    render() {
        return (

            <div>
                {this.state.isLoaded ? <Line 
                data={{
                    labels: this.getTimes(),
                    datasets: [{
                        label: "Histórico de Temperaturas no Porto",
                        data: this.getTemperatures(),
                        backgroundColor: [
                            'rgba(54, 162, 235, 0.2)'
                        ],
                        borderColor: [
                            'rgba(54, 162, 235, 1)'
                        ],
                        borderWidth: 1
                    }],
                }}
                height={800}
                width={1000}
                options={{
                    scales: {
                        yAxes: [{
                            ticks: {
                                beginAtZero: true,
                            }
                        }]
                    }
                }}
            /> : <div> Still loading... </div> }
            </div>
        )
    }
}

export default LineChartPorto