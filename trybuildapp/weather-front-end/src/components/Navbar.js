import React from 'react';

class NavBar extends React.Component {
    render() {
      return (
        <nav className="navbar navbar-dark bg-dark">
          <a className="navbar-brand" href="#top">
            <img  src={ "images/main-logo.png" } alt="weatherLogo" width="30" height="30" className="d-inline-block align-top" />
            Weather
          </a>
        </nav>
      );
    }
  }

  export default NavBar